pipeline{
    agent any
    stages{        
        stage('start nginx'){
            steps{
                bat '''cd D:\\Tools\\nginx-1.12.2
                    start nginx'''
            }
        }
        stage('list nginx pid'){
            steps{
                bat "tasklist /fi "imagename eq nginx.exe"
            }
        }
        stage('approve stage'){
            steps{
                input 'proceed to stop job'
            }
        }
        stage('kill nginx process'){
            steps{
                bat '''taskkill /F /fi "imagename eq nginx.exe'''
            }
        }
        stage('list nginx pid after kill'){
            steps{
                bat 'tasklist /fi "imagename eq nginx.exe'
            }
        }
        stage('demo stage'){
            steps{
                bat "echo 'JOB COMPLETED'"
            }
		}
        }
    }
}
