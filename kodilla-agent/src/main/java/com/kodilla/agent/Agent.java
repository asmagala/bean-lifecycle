package com.kodilla.agent;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.agent.builder.AgentBuilder.Default;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

public class Agent {
    public static void premain(String arg, Instrumentation instrumentation) {
        AgentBuilder agentBuilder = new Default()
                .type(ElementMatchers.nameStartsWith("com.kodilla"))
                .transform(((builder, typeDescription, classLoader, module, protectionDomain) ->         {
                    System.out.println("Class " + typeDescription);
                    return builder.visit(Advice.to(MyMethodMonitor.class).on(ElementMatchers.named("doSomething")));
                }));
        agentBuilder.installOn(instrumentation);
    }

    public static void  agentmain(String args, Instrumentation instrumentation) {
        premain(args, instrumentation);
    }
}
