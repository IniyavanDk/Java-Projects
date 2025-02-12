pipeline {
    agent any  // Use any available agent

    stages {
        stage('Checkout') {
            steps {
                // Checkout the 'main' branch from the specified repository
                git branch: 'main', url: 'https://github.com/IniyavanDk/Java-Projects.git'
            }
        }

        stage('Build') {
            steps {
                // Execute the Maven build
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Execute the Maven tests
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Package the application using Maven
                bat 'mvn package'
            }
        }

        stage('Publish Artifacts') {
            steps {
                // Archive the built artifacts (e.g., JAR file)
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build, Test, and Package stages completed successfully.'
        }
        failure {
            echo 'Build, Test, or Package stage failed.'
        }
    }
}
