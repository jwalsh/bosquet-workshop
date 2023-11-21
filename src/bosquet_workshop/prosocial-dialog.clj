(ns bosquet-workshop.prosocial-dialog
  (:require [hfds-clj.core :as hfds]))

(comment
  (hfds/download-ds
    {:dataset "allenai/prosocial-dialog"
     :split   "train"
     :config  "default"
     :offset  0
     :length  100}
    {:hfds/use-cache true
     :hfds/record-limit 1000}))


(hfds/load-dataset "Anthropic/hh-rlhf")


(hfds/load-dataset  {:dataset "allenai/prosocial-dialog"
                          :split   "train"
                          :config  "default"
                          :offset  0
                          :length  100}
               {:hfds/download-mode :reuse-dataset-if-exists
                :hfds/cache-dir     "/data"
                :hfds/limit         4000})
