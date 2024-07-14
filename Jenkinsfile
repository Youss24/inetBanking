pipeline {
    agent any

    tools {
        maven 'Maven' // Le nom de l'installation de Maven configurée dans Jenkins
    }
    
    stages {
        stage('Build') {
            steps {
                script {
                    def mvnHome = tool 'Maven'
                    sh "'${mvnHome}/bin/mvn' clean"
                }
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing the project....'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying the project....'
            }
        }
        
        stage('Release') {
            steps {
                echo 'Releasing the project....'
            }
        }
    }
}
