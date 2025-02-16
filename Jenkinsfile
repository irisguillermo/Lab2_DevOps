pipeline {
    agent any

    environment {
    }

    stages {
        stage('Checkout') {
            steps {
                // This step checks out the code from SCM (Git in this case)
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests using Maven or any other test framework
                    sh 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo 'Deploying application...'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed!'
        }

        success {
            echo 'Build succeeded!'
        }

        failure {
            echo 'Build failed!'
        }
    }
}
