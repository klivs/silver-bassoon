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
        stage("Test") {
            steps {
                sh "mvn clean test -Dspring.profiles.active=prod"
            }
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    jacoco(execPattern: '**/*.exed')
                }
            }
        }
        stage("SonarQube") {
            steps {
                withSonarQubeEnv('sonar') {
                    sh "mvn dependency-check:aggregate sonar:sonar -Dspring.profiles.active=prod -Dsonar.host.url=$SONAR_HOST_URL -Dsonar.login=$SONAR_AUTH_TOKEN -Dsonar.dependencyCheck.reportPath=target/dependency-check-report.xml"
                }
            }
        }
        stage("Deploy") {
            steps {
                sh "echo 'TODO'"
            }
        }

    }
}