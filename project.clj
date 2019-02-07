(defproject rest.api "0.1.0-SNAPSHOT"
  :description "FIXME"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.2"]
                 [ring/ring-defaults "0.2.3"]
                 [expectations "2.1.1"]]
  :plugins [[lein-ring "0.11.0"]]
  :ring {:handler rest.api.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
