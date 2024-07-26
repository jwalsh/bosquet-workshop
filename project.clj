(defproject bosquet-workshop "0.1.0-SNAPSHOT"
  :description "Bosquet workshop"
  :url "http://wal.sh/research/bosquet-workshop"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :main bosquet-workshop.core
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [selmer "1.12.59"]
                 [com.wsscode/pathom3 "2023.08.22-alpha"]
                 [integrant "0.8.1"]
                 [io.github.zmedelis/bosquet "v2023.11.21"]
                 [aero "1.1.6"]
                 [io.github.zmedelis/hfds-clj "v2023.11.05"]
                 ]
  :plugins [[jonase/eastwood "1.4.2"]]
  :repl-options {:init-ns bosquet-workshop.core})
