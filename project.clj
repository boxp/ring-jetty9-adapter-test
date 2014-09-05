(defproject ring-jetty9-adapter-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ring-jetty9-adapter-test.core
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [info.sunng/ring-jetty9-adapter "0.7.1"]]
  :ring {:handler ring-jetty9-adapter-test.core/app})
