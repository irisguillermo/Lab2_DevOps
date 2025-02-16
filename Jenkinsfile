pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // Run Maven build
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run Maven tests
                    sh 'mvn test'
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    // Add your deployment steps here if needed
                    echo 'Deploying application...'
                }
            }
        }
    }
    
    post {
        success {
            echo 'Build and tests passed successfully!'
        }
        failure {
            echo 'There were errors during the build or tests.'
        }
    }
}
