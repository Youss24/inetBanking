pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application.........'
                bat "mvn clean"
            }
        }
        
                stage('Test') {
            steps {
                echo 'Testing...'
                bat "mvn test"
            }
        }
        
                stage('Compile') {
            steps {
                echo 'Compiling...'
                bat "mvn compile"
            }
        }

                stage('Deploy') {
            steps {
                echo 'Depoloying...'
            }
        }
        
        
    }

}
