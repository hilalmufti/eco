(ns core)

(defn dot [v1 v2]
  (reduce + (map * v1 v2)))