import { useMapper, createNamespacedHelpers } from "./StateAndGetterMapper";
import { mapGetters } from "vuex";
export function useGetter(moduleName, mapper) {
  let mapperFn = mapGetters;
  if (typeof moduleName === "string" && moduleName.length > 0) {
    mapperFn = createNamespacedHelpers(moduleName).mapGetters;
  }
  const storeValue = useMapper(mapper, mapperFn);
  return storeValue;
}
