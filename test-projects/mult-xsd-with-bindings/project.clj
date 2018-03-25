(defproject mult-xsd-with-bindings "0.1.0-SNAPSHOT"
  :description "lein-xjc sample project with a single and simple xsd file"
  :url "http://www.example.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[clj-jaxb/lein-xjc "0.2.0-SNAPSHOT"]]
  :dependencies [[org.glassfish.jaxb/jaxb-xjc "2.3.0"]
                 [org.glassfish.jaxb/jaxb-runtime "2.3.0"]
                 [javax.activation/javax.activation-api "1.2.0"]]
  :xjc-plugin {:xjc-calls [{:xsd-file "xsd/first.xsd"
                            :binding "xsd/first-binding.jxb"}
                           {:xsd-file "xsd/second.xsd"
                            :binding "xsd/second-binding.jxb"}]})
