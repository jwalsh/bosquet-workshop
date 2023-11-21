(ns bosquet-workshop.config
  (:require [aero.core
             :refer [read-config]]))

(defn read-llm-config []
  (read-config "config.edn"))

(read-llm-config)
