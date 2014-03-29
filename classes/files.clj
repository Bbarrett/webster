(ns files
(:require [clojure.string :as string]))
(use 'clojure.java.io)

(def prompt "Enter file name:")


(defn check-for-file [file]
 (if (.exists (as-file file))
   (println file "found")
   (println "file not found")))

(defn name-file [prompt]
  (println prompt)
  (read-line))


 (defn search-for-input [input]
   (if (.exists (as-file input))
         (println "yes")
         (println "nope.")))

(defn check-input []
  (loop [input (name-file prompt)]
  (if (not= input nil)
    input
    (recur (name-file "That input was invalid, try again.")))))
  

             

          
   
  

