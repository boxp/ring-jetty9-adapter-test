(ns ring-jetty9-adapter-test.core
  (:require [ring.adapter.jetty9 :refer [run-jetty]]))

(defn app [req] 
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hi"})

(defn -main []
  (run-jetty app {:port 50505}))
