pipeline {
    agent any

    environment {
        // Define environment variables, if any
    }

    stages {
        // Checkout code from the repository
        stage('Checkout') {
            steps {
                // This step checks out the code from SCM (Git in this case)
                checkout scm
            }
        }

        // Build the project (e.g., compile, test, package)
        stage('Build') {
            steps {
                script {
                    // Run Maven build command (you can customize this step based on your build tool)
                    sh 'mvn clean install'
                }
            }
        }

        // Optional: Add additional stages such as testing or deployment
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
                    // Add your deployment steps here (e.g., copying files to a server, etc.)
                    echo 'Deploying application...'
                }
            }
        }
    }

    post {
        // Actions to perform after the pipeline runs (e.g., clean up, notifications)
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
