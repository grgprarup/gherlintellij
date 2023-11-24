package com.github.grgprarup.gherlintellij.inspections

import com.intellij.codeInspection.LocalInspectionTool
import org.

class GherkinInspection : LocalInspectionTool() {
    override fun getGroupDisplayName(): String {
        return CucumberBundle.message("cucumber.inspection.group.name")
    }
}