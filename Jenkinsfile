// noinspection GroovyAssignabilityCheck
pipeline {
    agent any()
    options {
        skipStagesAfterUnstable()
    }
    stages(
            stage("Build") {
                steps {
                    echo "Building..."
                }
            }
            stage("Pre-test") {
                steps {
                    echo "Pre testing..."
                }
            }
            stage("Test") {
                steps {
                    echo "Testing..."
                }
            }
            stage("Deploy") {
                steps {
                    echo "Deploying"
                }
            }

    )
}