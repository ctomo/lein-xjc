(defproject org.clojars.ctomo/lein-xjc "0.2.3"
  :description "Call xjc from leiningen."
  :url "https://github.com/ctomo/lein-xjc"
  :scm {:name "git"
        :url "https://github.com/ctomo/lein-xjc"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.glassfish.jaxb/jaxb-xjc "2.3.1"]
                 [org.glassfish.jaxb/jaxb-runtime "2.3.1"]
                 [javax.activation/javax.activation-api "1.2.0"]]
  :eval-in-leiningen true
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[midje "1.9.4"]
                                  [cljito "0.2.1"]
                                  [org.mockito/mockito-all "1.10.19"]]
                   :plugins [[lein-midje "3.1.3"]]}})
