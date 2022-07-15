// noinspection GroovyAssignabilityCheck
pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage("Build") {
            steps {
                parallel(
                        "step 1 ": { echo "Building..." },
                        "step 2 ": { echo "hello" },
                        "step 3 ": { echo "world" },
                        "step 4 ": { echo "!!!!!" }
                )
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

    }
}