pipeline {
    agent any

    tools {
        jdk 'JAVA_HOME'
        maven 'MAVEN'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/Maithili2201/TestNgProjectBasic.git',
                    branch: 'main',
                    credentialsId: 'git-github-token'
            }
        }

        stage('Build & Test') {
            steps {
                bat "mvn clean test"
            }
        }

        stage('Publish TestNG Results') {
            steps {
                junit 'test-output/testng-results.xml'
            }
        }
    }
}