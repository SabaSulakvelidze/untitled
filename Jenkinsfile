pipeline {
  agent any
  stages {
    stage('Check version') {
      parallel {
        stage('Check version') {
          agent any
          steps {
            bat 'mvn -version'
          }
        }

        stage('Build Maven') {
          steps {
            bat 'mvn clean deploy'
          }
        }

      }
    }

    stage('the end') {
      steps {
        echo 'Finito'
      }
    }

  }
}