(defproject es.corygil/corenlp "3.3.1-SNAPSHOT"
  :description "Clojure wrapper for the Stanford CoreNLP tools."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [edu.stanford.nlp/stanford-corenlp "3.3.1"]
                 [edu.stanford.nlp/stanford-corenlp "3.3.1"
                  :classifier "models"]
                 [cc.artifice/loom "0.1.3"]]
  :plugins [[lein-exec "0.3.2"]])
