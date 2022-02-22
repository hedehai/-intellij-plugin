package com.github.hedehai.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.hedehai.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
