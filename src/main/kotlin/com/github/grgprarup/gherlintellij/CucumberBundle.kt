package com.github.grgprarup.gherlintellij

import com.intellij.DynamicBundle
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.PropertyKey
import java.util.function.Supplier

object CucumberBundle {
    private const val BUNDLE: @NonNls String = "messages.CucumberBundle"
    private val INSTANCE: DynamicBundle = DynamicBundle(CucumberBundle::class.java, BUNDLE)

    fun message(@NotNull @PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: @NotNull Any): @NotNull @Nls String {
        return INSTANCE.getMessage(key, *params)
    }

    fun messagePointer(@NotNull @PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: @NotNull Any): @NotNull Supplier<@Nls String> {
        return INSTANCE.getLazyMessage(key, *params)
    }
}