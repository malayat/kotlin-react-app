package app

import react.*
import react.dom.*
//import logo.*
//import ticker.*
import hello.*
import tick.*
import tictactoe.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        /*div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()			
        }*/
		p {            
			helloMessage()
        }
		p {
			tick()
		}
		p {
			ticTacToe()
		}
    }
}

fun RBuilder.app() = child(App::class) {}
