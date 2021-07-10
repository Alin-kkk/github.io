package com.github.alinkk.githubio.services

import com.github.alinkk.githubio.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
