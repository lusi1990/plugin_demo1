package com.github.lusi1990.plugindemo1.services

import com.intellij.openapi.project.Project
import com.github.lusi1990.plugindemo1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
