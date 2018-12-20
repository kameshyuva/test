pipeline{
    agent any
    stages{        
        stage('start nginx'){
            steps{
                sh 'echo start nginx'
            }
        }
        stage('list nginx pid'){
            steps{
                sh  'echo list nginx pid'
            }
        }
        stage('approve stage'){
            steps{
                input 'proceed to stop job'
            }
        }
        stage('kill nginx process'){
            steps{
                sh 'echo kill nginx process'
            }
        }
        stage('list nginx pid after kill'){
            steps{
                sh 'echo list nginx pid after kill'
            }
        }
        stage('demo stage'){
            steps{
                sh 'echo JOB COMPLETED'
            }
	  }
    }
}
