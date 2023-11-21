;; fine-tune.clj
;; Functions to fine-tune model on dataset 

(ns bosquet-workshop.fine-tune
  (:require [bosquet.workflow :as wf]
            [bosquet.llm.generator :as bg]
            [bosquet-workshop.utils :as utils]))
              
(def llm-config 
  (utils/read-llm-config)) ; get model config

(defn train-sentiment-classifier []
  ; Fine-tune model and handle training loop
  (let [dataset (utils/get-yelp-dataset)
        model (bg/get-model llm-config)]
    (wf/train model dataset ; optimizer, epochs etc
              {:output_dir "results"})))
               
(defn generate [prompt]
  (bg/generate prompt llm-config))
