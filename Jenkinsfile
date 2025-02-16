pipeline {
    agent any

    environment {
        // Define environment variables here if needed
        MAVEN_HOME = '/opt/maven'
        JAVA_HOME = '/usr/lib/jvm/java-8-openjdk'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm // Checkout the code from SCM
            }
        }

        stage('Build') {
            steps {
                script {
                    // Run Maven to clean, compile, and build the project
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests (if any)
                    sh 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deployment steps (if applicable)
                    echo 'Deploying application...'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution complete!'
        }

        success {
            echo 'Build succeeded!'
        }

        failure {
            echo 'Build failed!'
        }
    }
}
