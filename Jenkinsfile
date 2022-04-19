pipeline {
  agent any
  stages {
    stage('Check Maven Version') {
      agent any
      environment {
        PATH = '/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin/'
      }
      steps {
        sh 'bat mvn --version'
      }
    }

    stage('Status Check') {
      steps {
        echo 'Finito'
      }
    }

  }
  environment {
    PATH = '/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin/'
  }
}