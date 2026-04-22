package com.ritense.valtimoplugins.suwinetauth.autoconfigure

import com.ritense.plugin.service.PluginService
import com.ritense.valtimoplugins.suwinetauth.plugin.SuwinetAuthPluginFactory
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean

@AutoConfiguration
class SuwinetAuthAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(SuwinetAuthPluginFactory::class)
    fun createSuwinetAuthPluginFactory(pluginService: PluginService): SuwinetAuthPluginFactory =
        SuwinetAuthPluginFactory(pluginService)
}
