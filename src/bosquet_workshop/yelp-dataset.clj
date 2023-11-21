(ns bosquet-workshop.yelp-dataset
  (:require [hfds-clj.core :as hfds])
  (:require [bosquet.llm.generator :as bg])
  (:require [aero.core
             :refer [read-config]]))

(def config (read-config "config.edn"))

(defn get-yelp-dataset []
  (hfds/load-dataset  {:dataset "yelp_polarity"
                       :split   "train"
                       :config  "default"
                       :offset  0
                       :length  100}
                      {:hfds/download-mode :reuse-dataset-if-exists
                       :hfds/cache-dir     "/data"
                       :hfds/limit         4000}))

(get-yelp-dataset)

(defn read-llm-config []
  (read-config "config.edn"))

(defn generate-llm [role question question-answer self-eval])
        (bg/generate
         {:role role
          :question question
          :question-answer question-answer
          :self-eval self-eval}
         {:you-are "computer wizard"
          :question "How does recursion work in Clojure?"})
