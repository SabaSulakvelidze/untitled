pipeline {
  agent any
  stages {
    stage('Check Maven Version') {
      agent any
      steps {
        sh 'cmd mvn --version'
      }
    }

    stage('Status Check') {
      steps {
        echo 'Finito'
      }
    }

  }
}