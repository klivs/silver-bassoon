// noinspection GroovyAssignabilityCheck
pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                   '''
                sh "mvn -version"
            }
        }
        stage("Build") {
            steps {
                sh "mvn clean install -DskipTests -Dspring.profiles.active=prod"
            }
        }
        stage("Deploy") {
            steps {
                sh "echo 'TODO'"
            }
        }

    }
}