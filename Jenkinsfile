pipeline {
  agent any
  stages {
    stage('checkout code') {
      steps {
        cleanWs()
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'gitHub', url: 'https://github.com/kameshyuva/test.git']]])
      }
    }
    stage('list folder') {
      steps {
        sh '''ls -lrth
pwd'''
      }
    }
    stage('start nginx') {
      steps {
        sh 'echo start nginx'
      }
    }
    stage('approve stage') {
      steps {
        input 'proceed to stop job'
      }
    }
    stage('kill nginx process') {
      steps {
        sh 'echo kill nginx process'
      }
    }
    stage('list nginx pid after kill') {
      steps {
        sh 'echo list nginx pid after kill'
      }
    }
    stage('demo stage') {
      steps {
        sh 'echo BUILD SUCCESS'
      }
    }
  }
  options {
    skipDefaultCheckout()
  }
  triggers {
    pollSCM('H/60 * * * *')
  }
}