/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ceragon;

import com.ceragon.protobuf.ProtoGeneratorTask;
import com.ceragon.protobuf.extension.ProtoExtension;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * A simple 'hello world' plugin.
 */
public class GradleGeneratorPlugin implements Plugin<Project> {


    @Override
    public void apply(Project project) {
        PluginContext.init(project);
        ProtoExtension protoExtension = project.getExtensions().create("proto", ProtoExtension.class);
        ProtoGeneratorTask protoGeneratorTask = new ProtoGeneratorTask(protoExtension);
        project.getTasks().register("proto", task -> task.doLast(protoGeneratorTask::execute));
        PluginContext.buildContext().clear();

    }
}
