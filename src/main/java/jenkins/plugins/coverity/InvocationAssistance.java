/*******************************************************************************
 * Copyright (c) 2011 Coverity, Inc

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Coverity, Inc - initial implementation and documentation
 *******************************************************************************/
package jenkins.plugins.coverity;

import hudson.Util;
import org.kohsuke.stapler.DataBoundConstructor;

public class InvocationAssistance {

    private final String buildArguments;
    private final String analyzeArguments;
    private final String commitArguments;

    /**
     * Absolute path to the intermediate directory that Coverity should use. Null to use the default.
     */
    private final String intermediateDir;

    @DataBoundConstructor
    public InvocationAssistance(String buildArguments, String analyzeArguments, String commitArguments, String intermediateDir) {
        this.intermediateDir = Util.fixEmpty(intermediateDir);
        this.buildArguments = Util.fixEmpty(buildArguments);
        this.analyzeArguments = Util.fixEmpty(analyzeArguments);
        this.commitArguments = Util.fixEmpty(commitArguments);
    }

    public String getBuildArguments() {
        return buildArguments;
    }

    public String getAnalyzeArguments() {
        return analyzeArguments;
    }

    public String getCommitArguments() {
        return commitArguments;
    }

    public String getIntermediateDir() {
        return intermediateDir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvocationAssistance that = (InvocationAssistance) o;

        if (analyzeArguments != null ? !analyzeArguments.equals(that.analyzeArguments) : that.analyzeArguments != null)
            return false;
        if (buildArguments != null ? !buildArguments.equals(that.buildArguments) : that.buildArguments != null)
            return false;
        if (commitArguments != null ? !commitArguments.equals(that.commitArguments) : that.commitArguments != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buildArguments != null ? buildArguments.hashCode() : 0;
        result = 31 * result + (analyzeArguments != null ? analyzeArguments.hashCode() : 0);
        result = 31 * result + (commitArguments != null ? commitArguments.hashCode() : 0);
        return result;
    }
}
