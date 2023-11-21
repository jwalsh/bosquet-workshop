;; utils.clj
;; Helper fns to load dataset and config

(ns bosquet-workshop.utils
  (:require [hfds-clj.core :as hfds]
            [aero.core :refer [read-config]]))

(def config 
  (read-config "config.edn")) ; load model & training config 

(defn get-yelp-dataset []
  ; Load Yelp dataset from HuggingFace
  (hfds/load-dataset {:dataset "yelp_polarity"  
                      :split "train"
                      :config "default"
                      :offset 0
                      :length 100} ; get subset of data
                     {:hfds/download-mode :reuse-dataset-if-exists 
                      :hfds/cache-dir "/data"
                      :hfds/limit 4000})) ; cache opts
                      
