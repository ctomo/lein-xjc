(defproject lein-xjc "0.1.0-SNAPSHOT"
  :description "Call xjc from leiningen."
  :url "http://lein-xjc.ferdinandhofherr.de"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[midje "1.6.0"]
                                  [cljito "0.2.1"]
                                  [org.mockito/mockito-all "1.9.5"]]
                   :plugins [[lein-midje "3.1.3"]]}})
