package org.jasig.cas.client.configuration;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;

/**
 * Abstraction to allow for pluggable methods for retrieving filter configuration.
 *
 * @author Scott Battaglia
 * @since 3.4.0
 */
public interface ConfigurationStrategy {


    /**
     * Retrieves the value for the provided {@param configurationKey}, falling back to the {@param configurationKey}'s {@link ConfigurationKey#getDefaultValue()} if nothing can be found.
     *
     * @param configurationKey the configuration key.  MUST NOT BE NULL.
     * @return the configured value, or the default value.
     */
    boolean getBoolean(ConfigurationKey<Boolean> configurationKey);

    /**
     * Retrieves the value for the provided {@param configurationKey}, falling back to the {@param configurationKey}'s {@link ConfigurationKey#getDefaultValue()} if nothing can be found.
     *
     * @param configurationKey the configuration key.  MUST NOT BE NULL.
     * @return the configured value, or the default value.
     */
    String getString(ConfigurationKey<String> configurationKey);

    /**
     * Retrieves the value for the provided {@param configurationKey}, falling back to the {@param configurationKey}'s {@link ConfigurationKey#getDefaultValue()} if nothing can be found.
     *
     * @param configurationKey the configuration key.  MUST NOT BE NULL.
     * @return the configured value, or the default value.
     */
    long getLong(ConfigurationKey<Long> configurationKey);

    /**
     * Retrieves the value for the provided {@param configurationKey}, falling back to the {@param configurationKey}'s {@link ConfigurationKey#getDefaultValue()} if nothing can be found.
     *
     * @param configurationKey the configuration key.  MUST NOT BE NULL.
     * @return the configured value, or the default value.
     */
    int getInt(ConfigurationKey<Integer> configurationKey);

    /**
     * Retrieves the value for the provided {@param configurationKey}, falling back to the {@param configurationKey}'s {@link ConfigurationKey#getDefaultValue()} if nothing can be found.
     *
     * @param configurationKey the configuration key.  MUST NOT BE NULL.
     * @return the configured value, or the default value.
     */
    <T> Class<? extends T> getClass(ConfigurationKey<Class<? extends T>> configurationKey);

    /**
     * Initializes the strategy.  This must be called before calling any of the "get" methods.
     *
     * @param filterConfig the filter configuration object.
     * @param filterClazz  the filter
     */
    void init(FilterConfig filterConfig, Class<? extends Filter> filterClazz);
}
