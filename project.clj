(defproject clj-jaxb/lein-xjc "0.2.0-SNAPSHOT"
  :description "Call xjc from leiningen."
  :url "https://github.com/fhofherr/lein-xjc"
  :scm {:name "git"
        :url "https://github.com/fhofherr/lein-xjc"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.glassfish.jaxb/jaxb-xjc "2.2.11"]
                 [org.glassfish.jaxb/jaxb-runtime "2.2.11"]]
  :eval-in-leiningen true
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[midje "1.6.2"]
                                  [cljito "0.2.1"]
                                  [org.mockito/mockito-all "1.9.5"]]
                   :plugins [[lein-midje "3.1.3"]]}})
