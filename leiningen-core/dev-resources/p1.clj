(defproject leiningen "2.0.0-SNAPSHOT"
  :description "Automate Clojure projects without setting your hair on fire."
  :url "https://github.com/technomancy/leiningen"
  :license {:name "Eclipse Public License"}
  :dependencies [[leiningen-core "2.0.0-SNAPSHOT"]
                 [clucy "0.2.2"]
                 [lancet "1.0.1"]
                 [robert/hooke "1.1.2"]
                 [stencil "0.2.0"]]
  :disable-implicit-clean true
  :eval-in-leiningen true)
