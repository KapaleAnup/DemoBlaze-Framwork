pipeline {
  agent any
  stages {
    stage('Build Dev') {
      parallel {
          steps {
            sh 'mvn clean install -DskipTests=true'
          }


        stage('chrome') {
          steps {
            sh 'mvn test -Denv=qa -Dbrowser=chrome'
          }
        }

      }
    }

    stage('Build QA') {
      parallel {
          steps {
            sh 'mvn clean install -DskipTests=true'
          }
        }

        stage('chrome') {
          steps {
            sh 'mvn test -Denv=qa -Dbrowser=chrome'
          }
        }

        stage('firefox') {
          steps {
            sh 'mvn test -Denv=qa -Dbrowser=firefox'
          }
        }

      }
    }

    stage('Build Stage') {
      parallel {
          steps {
            sh 'mvn clean install -DskipTests=true'
          }


        stage('firefox') {
          steps {
            sh 'mvn test -Denv=qa -Dbrowser=firefox'
          }
        }

        stage('chrome') {
          steps {
            sh 'mvn test -Denv=qa -Dbrowser=chrome'
          }
        }

      }
    }

  }

}
