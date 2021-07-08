pipeline{
    agent any
    
    stages{
        stage("entry point"){
            steps{
                echo "U have entered an automated ci/cd pipeline as a $CHOICE"
                echo "app-version : $VERSION"
            }
        }
        stage("build"){
            steps{
                echo "U are in stage-2 -- build"
                echo "app-version : $VERSION"
            }
        }
    
        stage("test"){
            steps{
                echo "U are in stage-3 -- test"
                echo "app-version : $VERSION"
            }
        }
        stage("deploy"){
            steps{
                echo "U are in stage-4 -- deployd"
                echo "app-version : $VERSION"
            }
        }
    }
}
