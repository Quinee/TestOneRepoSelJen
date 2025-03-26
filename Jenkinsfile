pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Quinee/TestOneRepoSelJen.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application...'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
            }
        }
    }
}
