(ns buildings-reagent.prod
  (:require
    [buildings-reagent.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
