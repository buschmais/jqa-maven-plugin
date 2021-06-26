package com.buschmais.jqassistant.scm.maven;

import java.util.List;

import com.buschmais.jqassistant.core.store.api.Store;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.project.MavenProject;


/**
 * Lists all plugins known based on the current configuration
 * to jQAssistant.
 */
// TODO
@Mojo(name = "list-plugins", threadSafe = true,
    configurator = "custom")
public abstract class ListPluginsMojo extends AbstractProjectMojo {

    @Override
    protected boolean isResetStoreBeforeExecution() {
        return false;
    }

    @Override
    protected boolean isConnectorRequired() {
        return false;
    }

    @Override
    protected void aggregate(MavenProject rootModule, List<MavenProject> projects, Store store) throws MojoExecutionException {
    }
}
