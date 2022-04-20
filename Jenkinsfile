pipeline {
  agent any
  stages {
    stage('Check version') {
      steps {
        sh 'git mvn --version'
      }
    }

    stage('the end') {
      steps {
        echo 'Finito'
      }
    }

  }
}