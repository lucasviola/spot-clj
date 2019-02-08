(defproject rest.api "0.1.0-SNAPSHOT"
  :description "FIXME"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.2"]
                 [ring/ring-defaults "0.2.3"]
                 [expectations "2.2.0-beta1"]]
  :plugins [[lein-ring "0.11.0"]]
  :ring {:handler rest.api.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]
         :plugins [[com.jakemccrary/lein-test-refresh "0.19.0"]]
                  venantius/ultra "0.5.1"}}
  :test-refresh {:growl false
                 :notify-on-success false
                 :quiet true
                 :changes-only true
                 :stack-trace-depth nil
                 :run-once false
                 :watch-dirs ["src" "test"]
                 :refresh-dirs ["src" "test"]})
